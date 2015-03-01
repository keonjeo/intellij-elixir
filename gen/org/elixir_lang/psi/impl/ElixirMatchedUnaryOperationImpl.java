// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.elixir_lang.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ElixirMatchedUnaryOperationImpl extends ASTWrapperPsiElement implements ElixirMatchedUnaryOperation {

  public ElixirMatchedUnaryOperationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) ((ElixirVisitor)visitor).visitMatchedUnaryOperation(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ElixirAlias getAlias() {
    return findChildByClass(ElixirAlias.class);
  }

  @Override
  @Nullable
  public ElixirAtCharTokenOrNumberOperation getAtCharTokenOrNumberOperation() {
    return findChildByClass(ElixirAtCharTokenOrNumberOperation.class);
  }

  @Override
  @Nullable
  public ElixirAtom getAtom() {
    return findChildByClass(ElixirAtom.class);
  }

  @Override
  @Nullable
  public ElixirCaptureCharTokenOrNumberOperation getCaptureCharTokenOrNumberOperation() {
    return findChildByClass(ElixirCaptureCharTokenOrNumberOperation.class);
  }

  @Override
  @Nullable
  public ElixirCharListHeredoc getCharListHeredoc() {
    return findChildByClass(ElixirCharListHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirCharListLine getCharListLine() {
    return findChildByClass(ElixirCharListLine.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedCharListSigilHeredoc getInterpolatedCharListSigilHeredoc() {
    return findChildByClass(ElixirInterpolatedCharListSigilHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedCharListSigilLine getInterpolatedCharListSigilLine() {
    return findChildByClass(ElixirInterpolatedCharListSigilLine.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedRegexHeredoc getInterpolatedRegexHeredoc() {
    return findChildByClass(ElixirInterpolatedRegexHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedRegexLine getInterpolatedRegexLine() {
    return findChildByClass(ElixirInterpolatedRegexLine.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedSigilHeredoc getInterpolatedSigilHeredoc() {
    return findChildByClass(ElixirInterpolatedSigilHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedSigilLine getInterpolatedSigilLine() {
    return findChildByClass(ElixirInterpolatedSigilLine.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedStringSigilHeredoc getInterpolatedStringSigilHeredoc() {
    return findChildByClass(ElixirInterpolatedStringSigilHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedStringSigilLine getInterpolatedStringSigilLine() {
    return findChildByClass(ElixirInterpolatedStringSigilLine.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedWordsHeredoc getInterpolatedWordsHeredoc() {
    return findChildByClass(ElixirInterpolatedWordsHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedWordsLine getInterpolatedWordsLine() {
    return findChildByClass(ElixirInterpolatedWordsLine.class);
  }

  @Override
  @Nullable
  public ElixirList getList() {
    return findChildByClass(ElixirList.class);
  }

  @Override
  @Nullable
  public ElixirLiteralCharListSigilHeredoc getLiteralCharListSigilHeredoc() {
    return findChildByClass(ElixirLiteralCharListSigilHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirLiteralCharListSigilLine getLiteralCharListSigilLine() {
    return findChildByClass(ElixirLiteralCharListSigilLine.class);
  }

  @Override
  @Nullable
  public ElixirLiteralRegexHeredoc getLiteralRegexHeredoc() {
    return findChildByClass(ElixirLiteralRegexHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirLiteralRegexLine getLiteralRegexLine() {
    return findChildByClass(ElixirLiteralRegexLine.class);
  }

  @Override
  @Nullable
  public ElixirLiteralSigilHeredoc getLiteralSigilHeredoc() {
    return findChildByClass(ElixirLiteralSigilHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirLiteralSigilLine getLiteralSigilLine() {
    return findChildByClass(ElixirLiteralSigilLine.class);
  }

  @Override
  @Nullable
  public ElixirLiteralStringSigilHeredoc getLiteralStringSigilHeredoc() {
    return findChildByClass(ElixirLiteralStringSigilHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirLiteralStringSigilLine getLiteralStringSigilLine() {
    return findChildByClass(ElixirLiteralStringSigilLine.class);
  }

  @Override
  @Nullable
  public ElixirLiteralWordsHeredoc getLiteralWordsHeredoc() {
    return findChildByClass(ElixirLiteralWordsHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirLiteralWordsLine getLiteralWordsLine() {
    return findChildByClass(ElixirLiteralWordsLine.class);
  }

  @Override
  @Nullable
  public ElixirMatchedAtOperation getMatchedAtOperation() {
    return findChildByClass(ElixirMatchedAtOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedNonNumericCaptureOperation getMatchedNonNumericCaptureOperation() {
    return findChildByClass(ElixirMatchedNonNumericCaptureOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedUnaryOperation getMatchedUnaryOperation() {
    return findChildByClass(ElixirMatchedUnaryOperation.class);
  }

  @Override
  @Nullable
  public ElixirNoParenthesesManyArgumentsQualifiedCall getNoParenthesesManyArgumentsQualifiedCall() {
    return findChildByClass(ElixirNoParenthesesManyArgumentsQualifiedCall.class);
  }

  @Override
  @Nullable
  public ElixirNoParenthesesManyArgumentsUnqualifiedCall getNoParenthesesManyArgumentsUnqualifiedCall() {
    return findChildByClass(ElixirNoParenthesesManyArgumentsUnqualifiedCall.class);
  }

  @Override
  @Nullable
  public ElixirNoParenthesesNoArgumentsQualifiedCall getNoParenthesesNoArgumentsQualifiedCall() {
    return findChildByClass(ElixirNoParenthesesNoArgumentsQualifiedCall.class);
  }

  @Override
  @Nullable
  public ElixirNoParenthesesNoArgumentsUnqualifiedCallOrVariable getNoParenthesesNoArgumentsUnqualifiedCallOrVariable() {
    return findChildByClass(ElixirNoParenthesesNoArgumentsUnqualifiedCallOrVariable.class);
  }

  @Override
  @Nullable
  public ElixirNumber getNumber() {
    return findChildByClass(ElixirNumber.class);
  }

  @Override
  @Nullable
  public ElixirQualifiedAlias getQualifiedAlias() {
    return findChildByClass(ElixirQualifiedAlias.class);
  }

  @Override
  @Nullable
  public ElixirStringHeredoc getStringHeredoc() {
    return findChildByClass(ElixirStringHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirStringLine getStringLine() {
    return findChildByClass(ElixirStringLine.class);
  }

  @Override
  @Nullable
  public ElixirUnaryCharTokenOrNumberOperation getUnaryCharTokenOrNumberOperation() {
    return findChildByClass(ElixirUnaryCharTokenOrNumberOperation.class);
  }

  @Override
  @NotNull
  public ElixirUnaryPrefixOperator getUnaryPrefixOperator() {
    return findNotNullChildByClass(ElixirUnaryPrefixOperator.class);
  }

}
