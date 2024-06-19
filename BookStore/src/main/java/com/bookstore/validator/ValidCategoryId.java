package com.bookstore.validator;
import jakarta.validation.Constraint;
import jakarta.validation. Payload;
import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
@Target({TYPE, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidCategoryIdValidator.class)
public @interface ValidCategoryId {
    String message() default "Danh mục sách không hợp lệ"; //Thông báo khi vi phạm ràng buộc
    Class<?>[] groups () default {}; //Nhóm các ràng buộc liên quan lại với nhau.
    Class<? extends Payload>[] payload() default {}; //Cung cấp thêm chi tiết về lỗi
}