// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.ericsson.otp.erlang.OtpErlangObject;

public interface ElixirNoParenthesesExpression extends Quotable {

  @Nullable
  ElixirAlias getAlias();

  @Nullable
  ElixirAtNumericOperation getAtNumericOperation();

  @Nullable
  ElixirAtom getAtom();

  @Nullable
  ElixirAtomKeyword getAtomKeyword();

  @Nullable
  ElixirBinaryWholeNumber getBinaryWholeNumber();

  @Nullable
  ElixirCaptureNumericOperation getCaptureNumericOperation();

  @Nullable
  ElixirCharListHeredoc getCharListHeredoc();

  @Nullable
  ElixirCharListLine getCharListLine();

  @Nullable
  ElixirCharToken getCharToken();

  @Nullable
  ElixirDecimalFloat getDecimalFloat();

  @Nullable
  ElixirDecimalWholeNumber getDecimalWholeNumber();

  @Nullable
  ElixirEmptyBlock getEmptyBlock();

  @Nullable
  ElixirEmptyParentheses getEmptyParentheses();

  @Nullable
  ElixirHexadecimalWholeNumber getHexadecimalWholeNumber();

  @Nullable
  ElixirInterpolatedCharListSigilHeredoc getInterpolatedCharListSigilHeredoc();

  @Nullable
  ElixirInterpolatedCharListSigilLine getInterpolatedCharListSigilLine();

  @Nullable
  ElixirInterpolatedRegexHeredoc getInterpolatedRegexHeredoc();

  @Nullable
  ElixirInterpolatedRegexLine getInterpolatedRegexLine();

  @Nullable
  ElixirInterpolatedSigilHeredoc getInterpolatedSigilHeredoc();

  @Nullable
  ElixirInterpolatedSigilLine getInterpolatedSigilLine();

  @Nullable
  ElixirInterpolatedStringSigilHeredoc getInterpolatedStringSigilHeredoc();

  @Nullable
  ElixirInterpolatedStringSigilLine getInterpolatedStringSigilLine();

  @Nullable
  ElixirInterpolatedWordsHeredoc getInterpolatedWordsHeredoc();

  @Nullable
  ElixirInterpolatedWordsLine getInterpolatedWordsLine();

  @Nullable
  ElixirList getList();

  @Nullable
  ElixirLiteralCharListSigilHeredoc getLiteralCharListSigilHeredoc();

  @Nullable
  ElixirLiteralCharListSigilLine getLiteralCharListSigilLine();

  @Nullable
  ElixirLiteralRegexHeredoc getLiteralRegexHeredoc();

  @Nullable
  ElixirLiteralRegexLine getLiteralRegexLine();

  @Nullable
  ElixirLiteralSigilHeredoc getLiteralSigilHeredoc();

  @Nullable
  ElixirLiteralSigilLine getLiteralSigilLine();

  @Nullable
  ElixirLiteralStringSigilHeredoc getLiteralStringSigilHeredoc();

  @Nullable
  ElixirLiteralStringSigilLine getLiteralStringSigilLine();

  @Nullable
  ElixirLiteralWordsHeredoc getLiteralWordsHeredoc();

  @Nullable
  ElixirLiteralWordsLine getLiteralWordsLine();

  @Nullable
  ElixirMatchedAdditionOperation getMatchedAdditionOperation();

  @Nullable
  ElixirMatchedAndOperation getMatchedAndOperation();

  @Nullable
  ElixirMatchedArrowOperation getMatchedArrowOperation();

  @Nullable
  ElixirMatchedCallOperation getMatchedCallOperation();

  @Nullable
  ElixirMatchedCaptureNonNumericOperation getMatchedCaptureNonNumericOperation();

  @Nullable
  ElixirMatchedComparisonOperation getMatchedComparisonOperation();

  @Nullable
  ElixirMatchedDotOperation getMatchedDotOperation();

  @Nullable
  ElixirMatchedHatOperation getMatchedHatOperation();

  @Nullable
  ElixirMatchedInMatchOperation getMatchedInMatchOperation();

  @Nullable
  ElixirMatchedInOperation getMatchedInOperation();

  @Nullable
  ElixirMatchedMatchOperation getMatchedMatchOperation();

  @Nullable
  ElixirMatchedMultiplicationOperation getMatchedMultiplicationOperation();

  @Nullable
  ElixirMatchedNonNumericAtOperation getMatchedNonNumericAtOperation();

  @Nullable
  ElixirMatchedOrOperation getMatchedOrOperation();

  @Nullable
  ElixirMatchedPipeOperation getMatchedPipeOperation();

  @Nullable
  ElixirMatchedRelationalOperation getMatchedRelationalOperation();

  @Nullable
  ElixirMatchedTwoOperation getMatchedTwoOperation();

  @Nullable
  ElixirMatchedTypeOperation getMatchedTypeOperation();

  @Nullable
  ElixirMatchedUnaryNonNumericOperation getMatchedUnaryNonNumericOperation();

  @Nullable
  ElixirMatchedWhenOperation getMatchedWhenOperation();

  @Nullable
  ElixirNoParenthesesKeywords getNoParenthesesKeywords();

  @Nullable
  ElixirNoParenthesesManyStrictNoParenthesesExpression getNoParenthesesManyStrictNoParenthesesExpression();

  @Nullable
  ElixirNoParenthesesNoArgumentsUnqualifiedCallOrVariable getNoParenthesesNoArgumentsUnqualifiedCallOrVariable();

  @Nullable
  ElixirOctalWholeNumber getOctalWholeNumber();

  @Nullable
  ElixirStringHeredoc getStringHeredoc();

  @Nullable
  ElixirStringLine getStringLine();

  @Nullable
  ElixirUnaryNumericOperation getUnaryNumericOperation();

  @Nullable
  ElixirUnknownBaseWholeNumber getUnknownBaseWholeNumber();

  @NotNull
  OtpErlangObject quote();

}
