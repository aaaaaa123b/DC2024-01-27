package by.bsuir.vladislavmatsiushenko.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Violation {
    private final String message;
    private final long status;
}