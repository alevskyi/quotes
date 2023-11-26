package ua.training.quotes.persistence;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import ua.training.quotes.model.Lang;

@Converter(autoApply=true)
public class LangConverter implements AttributeConverter<Lang, String>{

	@Override
	public String convertToDatabaseColumn(Lang attribute) {
		return attribute.value();
	}

	@Override
	public Lang convertToEntityAttribute(String dbData) {
		return Lang.fromValue(dbData);
	}

}