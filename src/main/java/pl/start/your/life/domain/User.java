package pl.start.your.life.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USERS")
@Data
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    @Column(nullable = false)
    private String login;
    @NonNull
    @Column(nullable = false)
    private String password;
}
