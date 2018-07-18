package us.cnlist.cryptsvc.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "SYSTEM_USER")
public class SystemUser implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "SystemUserSG")
    @SequenceGenerator(name = "SystemUserSG", sequenceName = "SEQ_SYSUSER", allocationSize = 1)
    private Long id;

    @Column(name = "user_login")
    private String login;

    @Column(name = "user_passwd")
    private byte[] password;

}
