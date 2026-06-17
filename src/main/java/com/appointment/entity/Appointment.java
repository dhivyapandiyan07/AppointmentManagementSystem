
package com.appointment.entity;
import jakarta.persistence.*; import lombok.*; import java.time.LocalDateTime;
@Entity @Data public class Appointment{
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;
@ManyToOne Doctor doctor; @ManyToOne Patient patient;
LocalDateTime appointmentTime; String status;
}
