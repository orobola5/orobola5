package africa.semicolon.trueCaller.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Student {
    @NonNull
    private int id;
    @NonNull
    private String name;
    @NonNull
    private  int grade;
    private int feesPaid;
    private int totalFees;
}
