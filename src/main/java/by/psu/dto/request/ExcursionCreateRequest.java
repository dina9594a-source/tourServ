package by.psu.dto.request;

public record ExcursionCreateRequest(
        String guideName,
        String excursionType,
        boolean lunchIncluded
) {
}
