package task7lombok.com.company;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public enum MeasurementType {
    //литры, галлоны
    liter, gallon
}
