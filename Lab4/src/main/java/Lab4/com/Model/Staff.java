package Lab4.com.Model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.*; // <-- nhớ import cho validate

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Staff {

    @NotBlank(message = "Chưa nhập email")
    @Email(message = "Email không đúng định dạng")
    private String id;

    @NotBlank(message = "Chưa nhập họ và tên")
    private String fullname;

    @Default
    private String photo = "photo.jpg";

    @NotNull(message = "Chưa chọn giới tính")
    private Boolean gender = true;

    @NotNull(message = "Chưa nhập ngày sinh")
    @Past(message = "Ngày sinh không hợp lệ")
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date birthday = new Date();

    @NotNull(message = "Chưa nhập lương")
    @Min(value = 1000, message = "Lương tối thiểu phải là 1000")
    private Double salary = 12345.6789;

    @Default
    private Integer level = 0;
}
