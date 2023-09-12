package com.example.allforkids_aos
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater

class CommunityReviewPostAdapter(private val posts: List<CommunityReviewPost>) : RecyclerView.Adapter<CommunityReviewPostAdapter.PostViewHolder>() {

    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.review_post_title)
        val contentTextView: TextView = itemView.findViewById(R.id.review_post_content)
        val postImageView: ImageView = itemView.findViewById(R.id.review_post_img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.review_item, parent, false)
        return PostViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = posts[position]
        holder.titleTextView.text = post.title
        holder.contentTextView.text = post.content
        holder.postImageView.setImageResource(post.postImageResId)
    }

    override fun getItemCount(): Int {
        return posts.size
    }
}