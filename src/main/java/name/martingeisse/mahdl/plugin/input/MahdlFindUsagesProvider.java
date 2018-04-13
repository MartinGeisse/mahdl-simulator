/*
 * Copyright (c) 2018 Martin Geisse
 * This file is distributed under the terms of the MIT license.
 */
package name.martingeisse.mahdl.plugin.input;

import com.intellij.lang.cacheBuilder.DefaultWordsScanner;
import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.tree.TokenSet;
import name.martingeisse.mahdl.plugin.input.psi.Module;
import name.martingeisse.mahdl.plugin.input.psi.ModuleInstanceDefinition;
import name.martingeisse.mahdl.plugin.input.psi.PortDefinition;
import name.martingeisse.mahdl.plugin.input.psi.SignalLikeDefinition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 *
 */
public class MahdlFindUsagesProvider implements FindUsagesProvider {

	@Nullable
	@Override
	public WordsScanner getWordsScanner() {
		return new DefaultWordsScanner(new MahdlLexer(),
			TokenSet.create(Symbols.IDENTIFIER, Symbols.qualifiedModuleName),
			TokenGroups.COMMENTS,
			TokenSet.create(Symbols.TEXT_LITERAL)
		);
	}

	@Override
	public boolean canFindUsagesFor(@NotNull PsiElement psiElement) {
		return (psiElement instanceof Module || psiElement instanceof PortDefinition ||
			psiElement instanceof SignalLikeDefinition || psiElement instanceof ModuleInstanceDefinition);
	}

	@Nullable
	@Override
	public String getHelpId(@NotNull PsiElement psiElement) {
		return null;
	}

	@NotNull
	@Override
	public String getType(@NotNull PsiElement psiElement) {
		return "symbol";
	}

	@NotNull
	@Override
	public String getDescriptiveName(@NotNull PsiElement psiElement) {
		return getNodeText(psiElement, false);
	}

	@NotNull
	@Override
	public String getNodeText(@NotNull PsiElement psiElement, boolean useFullName) {
		if (psiElement instanceof PsiNamedElement) {
			String name = ((PsiNamedElement) psiElement).getName();
			if (name != null) {
				return name;
			} else {
				return psiElement.getText();
			}
		}
		PsiReference reference = psiElement.getReference();
		if (reference != null) {
			return reference.getCanonicalText();
		}
		return psiElement.getText();
	}

}
