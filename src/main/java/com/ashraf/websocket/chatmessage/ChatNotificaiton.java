package com.ashraf.websocket.chatmessage;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatNotificaiton {
    private String id;
    private String senderId;
    private String recipientId;
    private String content;
}
