package com.team03.monew.dto.comment.response;

public record CommentActivityDto(String id, String createdBy, String commentId, String articleId,String articledTitle, String commentUserId, String commentUserNickName, String commentContent, Integer commentLikeCount, String commentCreatedAt) {
}
