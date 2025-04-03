package jamol.notificationservice.service;

import jamol.notificationservice.entity.Notification;
import jamol.notificationservice.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class NotificationService {
    private NotificationRepository notificationRepository;


    public void createNotification(String message) {
        Notification notification = new Notification();
        notification.setMessage(message);
        notificationRepository.save(notification);
    }

    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

}
