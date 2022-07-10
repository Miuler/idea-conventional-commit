package com.github.lppedd.cc.language.psi

import com.intellij.psi.PsiElementVisitor
import com.intellij.psi.impl.source.tree.LeafPsiElement
import com.intellij.psi.tree.IElementType

/**
 * @author Edoardo Luppi
 */
class ConventionalCommitScopeValuePsiElement(
    type: IElementType,
    text: CharSequence,
) : LeafPsiElement(type, text) {
  override fun accept(visitor: PsiElementVisitor) {
    if (visitor is ConventionalCommitPsiElementVisitor) {
      visitor.visitScopeValue(this)
    } else {
      super.accept(visitor)
    }
  }

  override fun toString(): String =
    "ConventionalCommitScopeValuePsiElement"
}