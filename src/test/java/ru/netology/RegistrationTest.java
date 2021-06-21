package ru.netology;


import org.junit.jupiter.api.Test;

import java.time.Duration;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static ru.netology.LocalDate.localDate;


class RegistrationTest {


    @Test
    void ValidForm() {
        open("http://localhost:9999");
        $("[class=input__control]").setValue("Москва");
        int inDays = 4;
        localDate (inDays);
        $("[data-test-id=name].input_type_text .input__control").setValue("Владимир");
        $("[data-test-id=phone]").$("[name=phone]").setValue("+79000000000");
        $("[data-test-id=agreement]").click();
        $$("[class=button__text]").find(exactText("Забронировать")).click();
        $(withText("Успешно!")).shouldBe(visible, Duration.ofSeconds(15));

    }




}

