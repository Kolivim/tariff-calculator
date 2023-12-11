package ru.fastdelivery.presentation.api.request.characteristics;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigInteger;

public record CargoPackageСharacteristics(
        @Schema(description = "Вес упаковки, граммы", example = "5667.45")
        BigInteger weight,

        @Schema(description = "Длина упаковки, мм", example = "345")
        BigInteger length,

        @Schema(description = "Ширина упаковки, мм", example = "589")
        BigInteger width,

        @Schema(description = "Высота упаковки, мм", example = "2345")
        BigInteger height
) {
}
