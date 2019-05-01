package de.refactoringBot.refactoring;

import java.util.HashMap;

import de.refactoringBot.refactoring.supportedRefactorings.*;
import de.refactoringBot.refactoring.supportedRefactorings.removeCodeClones.RemoveCodeClones;
import org.springframework.stereotype.Component;

import de.refactoringBot.refactoring.supportedRefactorings.ExtractMethod.ExtractMethod;

/**
 * This class holds all supported refactoring operations and maps them to a
 * refactoring class which performs that specific refactoring.
 * 
 * @author Stefan Basaric
 *
 */
@Component
public class RefactoringOperations {

	public final String ADD_OVERRIDE_ANNOTATION = "Add Override Annotation";
	public final String RENAME_METHOD = "Rename Method";
	public final String EXTRACT_METHOD = "Extract Method";
	public final String REMOVE_CODE_CLONES = "Remove code clones";
	public final String REORDER_MODIFIER = "Reorder Modifier";
	public final String REMOVE_PARAMETER = "Remove Parameter";
	public final String UNKNOWN = "Unknown Refactoring";

	/**
	 * This method maps a specific refactoring to a java class which can perform
	 * that refactoring.
	 * 
	 * @return
	 */
	public HashMap<String, Class<?>> getRuleToClassMapping() {
		HashMap<String, Class<?>> ruleToClassMapping = new HashMap<>();
		ruleToClassMapping.put(ADD_OVERRIDE_ANNOTATION, AddOverrideAnnotation.class);
		ruleToClassMapping.put(REORDER_MODIFIER, ReorderModifier.class);
		ruleToClassMapping.put(RENAME_METHOD, RenameMethod.class);
		ruleToClassMapping.put(REMOVE_CODE_CLONES, RemoveCodeClones.class);
		ruleToClassMapping.put(EXTRACT_METHOD, ExtractMethod.class);
		ruleToClassMapping.put(REMOVE_PARAMETER, RemoveMethodParameter.class);

		return ruleToClassMapping;
	}

}
