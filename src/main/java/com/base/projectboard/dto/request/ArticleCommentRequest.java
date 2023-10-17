package com.base.projectboard.dto.request;

import com.base.projectboard.dto.ArticleCommentDto;
import com.base.projectboard.dto.UserAccountDto;

import java.util.Objects;

/**
 * DTO for {@link com.base.projectboard.domain.ArticleComment}
 */
public record ArticleCommentRequest(Long articleId, String content) {

    public static ArticleCommentRequest of(Long articleId, String content) {
        return new ArticleCommentRequest(articleId, content);
    }

    public ArticleCommentDto toDto(UserAccountDto userAccountDto) {
        return ArticleCommentDto.of(
                articleId,
                userAccountDto,
                content
        );
    }
}