package jamol.notificationservice.dto;

import java.time.LocalDateTime;

public record NotificationDto(
        Long id,
        String message,
        LocalDateTime createdAt

) {
}
