package day08_passByValue_ImmutableClasses_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C13_Period {

    public static void main(String[] args) {

        // 12 Haziran 1993 tarihinde dogan bir kisinin yasini bulun

        LocalDate bugun = LocalDate.now();
        LocalDate dogumTarihi = LocalDate.of(1993,6,12);

        Period yas = Period.between(dogumTarihi,bugun);

        System.out.println(yas); // P31Y2M6D

        System.out.println(yas.getYears()); // 31

        System.out.println(yas.getDays()); // 6 (bugun 18'i dogum tarihi 12'si)

        Period geriyeGitme = Period.between(bugun,dogumTarihi);
        System.out.println(geriyeGitme); // P-31Y-2M-6D
    }
}
