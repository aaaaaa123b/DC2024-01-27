package service.tweetservicediscussion.domain.response;

public record MessageResponseTo(
        Long id,
        Long tweetId,
        String content) {
}
