package com.afk.allforkids_aos.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.afk.allforkids_aos.R
import com.afk.allforkids_aos.LocationData
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import net.daum.mf.map.api.MapPOIItem
import net.daum.mf.map.api.MapPoint
import net.daum.mf.map.api.MapView

class MapFragment : Fragment() {
    private lateinit var mapView: MapView
    private var bottomSheetDialog: BottomSheetDialog? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_map, container, false)
        mapView = MapView(requireContext())
        val mapViewContainer = rootView.findViewById(R.id.map_view) as ViewGroup
        mapViewContainer.addView(mapView)

        val searchView = inflater.inflate(R.layout.map_float_sheet, mapViewContainer, false)
        mapViewContainer.addView(searchView)

        val defaultBottomView = inflater.inflate(R.layout.map_default_bottom_sheet, mapViewContainer, false)
        mapViewContainer.addView(defaultBottomView)

        addMarkers()
        return rootView
    }

    private fun addMarkers() {
        val markerLocation = arrayListOf(
            LocationData("경복궁", "대한민국 서울특별시 종로구 혜화동 133-3", 37.5776, 126.9769),
            LocationData("덕수궁", "서울 중구 세종대로 99 덕수궁", 37.5007, 126.9656),
            LocationData("남산서울타워", "서울 용산구 남산공원길 105", 37.5661, 126.9687),
            LocationData("롯데월드", "서울특별시 송파구 송파나루길 15", 37.50888, 127.1001),
            LocationData("시청역", "서울특별시 중구 을지로 1가 31-1", 37.5663, 126.9778)
        )

        // 고유한 id 값을 생성
        var markerId = 0

        // 마커를 추가하고 말풍선 비활성화
        for (location in markerLocation) {
            val marker = MapPOIItem()
            marker.itemName = location.name

            // 고유한 id 값을 마커의 tag로 설정
            marker.tag = markerId

            marker.mapPoint = MapPoint.mapPointWithGeoCoord(location.latitude, location.longitude)
            marker.markerType = MapPOIItem.MarkerType.CustomImage
            marker.customImageResourceId = R.drawable.ic_pin_png // ic_pin_png.png를 사용
            marker.isCustomImageAutoscale = false
            marker.setCustomImageAnchor(0.5f, 1.0f)

            // 말풍선 비활성화
            marker.isShowCalloutBalloonOnTouch = false

            mapView.addPOIItem(marker)

            // 다음 마커에 대한 고유한 id를 생성
            markerId++
        }

        mapView.setPOIItemEventListener(object : MapView.POIItemEventListener {
            override fun onPOIItemSelected(mapView: MapView?, item: MapPOIItem?) {
                // 마커 클릭 시 이벤트 처리
                item?.let {
                    val locationData = markerLocation[it.tag as Int]
                    showBottomSheet(locationData)

                    val mapPoint = MapPoint.mapPointWithGeoCoord(locationData.latitude, locationData.longitude)
                    mapView?.setMapCenterPointAndZoomLevel(mapPoint, 1, true)
                }
            }

            override fun onCalloutBalloonOfPOIItemTouched(
                mapView: MapView?,
                item: MapPOIItem?
            ) {
                // 마커 말풍선 클릭 시 이벤트 처리
            }

            override fun onDraggablePOIItemMoved(mapView: MapView?, poiItem: MapPOIItem?, mapPoint: MapPoint?) {
                // 드래그 가능한 마커 이동 이벤트 처리
            }

            override fun onCalloutBalloonOfPOIItemTouched(
                mapView: MapView?,
                item: MapPOIItem?,
                calloutBalloonButtonType: MapPOIItem.CalloutBalloonButtonType?
            ) {
                // 마커 말풍선 버튼 클릭 시 이벤트 처리
            }
        })
    }


    private fun showBottomSheet(locationData: LocationData) {
        bottomSheetDialog?.dismiss() // 이미 열려있는 바텀 시트가 있으면 닫음
        bottomSheetDialog = BottomSheetDialog(requireContext())
        val view = layoutInflater.inflate(R.layout.map_bottom_sheet, null)
        val nameTextView = view.findViewById<TextView>(R.id.placeTextView1)
        val addressTextView = view.findViewById<TextView>(R.id.addressTextView1)

        nameTextView.text = locationData.name
        addressTextView.text = locationData.address

        val heartBtn = view.findViewById<ImageView>(R.id.heartImageView1)

        heartBtn.setOnClickListener {
            val currentImg = heartBtn.drawable
            if (currentImg.constantState == resources.getDrawable(R.drawable.unselectede_heart).constantState) {
                heartBtn.setImageResource(R.drawable.selected_heart)
            } else if (currentImg.constantState == resources.getDrawable(R.drawable.selected_heart).constantState){
                heartBtn.setImageResource(R.drawable.unselectede_heart)
            }
        }

        view.setOnClickListener {
            showDetailSheet()
        }

        bottomSheetDialog?.setContentView(view)
        bottomSheetDialog?.show()
    }

    private fun showDetailSheet() {

        // map_detail_sheet 보여주기
        val detailSheetDialog = BottomSheetDialog(requireContext())
        val detailView = layoutInflater.inflate(R.layout.map_detail_sheet, null)

        // ...

        detailSheetDialog.setContentView(detailView)

        val behavior = BottomSheetBehavior.from(detailView.parent as View)
        behavior.state = BottomSheetBehavior.STATE_EXPANDED

        detailSheetDialog.show()
    }


}
