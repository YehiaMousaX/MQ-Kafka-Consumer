package MQ.Kafka.dbo;


import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Data


public class customer {
    private int id;
    private String name;
    private String email;
    private String contactNo;
}
