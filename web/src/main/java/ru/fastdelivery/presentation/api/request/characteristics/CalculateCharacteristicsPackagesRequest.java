package ru.fastdelivery.presentation.api.request.characteristics;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import ru.fastdelivery.presentation.api.request.CargoPackage;

import java.util.List;

@Schema(description = "Данные для расчета стоимости доставки")
public record CalculateCharacteristicsPackagesRequest(
        @Schema(description = "Список упаковок отправления",
                example = "[{!!!Дописать }]")   // TODO: Дописать пример
        @NotNull
        @NotEmpty
        List<CargoPackageСharacteristics> packages,

        @Schema(description = "Трехбуквенный код валюты", example = "RUB")
        @NotNull
        String currencyCode
) {
}
