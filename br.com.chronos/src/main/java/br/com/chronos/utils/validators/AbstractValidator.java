package br.com.chronos.utils.validators;

import java.util.Iterator;

import javax.validation.ConstraintViolation;
import javax.validation.ElementKind;
import javax.validation.Path;

public class AbstractValidator {

	private ConstraintViolation<?> ruleViolation;

	public void setRuleViolation(ConstraintViolation<?> ruleViolation) {
		this.ruleViolation = ruleViolation;
	}

	public String getMessage() {
		return this.ruleViolation.getMessage();
	}

	public String getField() {

		Path path = this.ruleViolation.getPropertyPath();

		String propertyName = null;

		for (Iterator<Path.Node> i = path.iterator(); i.hasNext();) {

			Path.Node node = i.next();

			if (ElementKind.PROPERTY.equals(node.getKind())) {

				propertyName = node.getName();

			}

		}

		return propertyName;

	}	
}
