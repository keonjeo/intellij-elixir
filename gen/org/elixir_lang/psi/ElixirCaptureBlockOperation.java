// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import com.ericsson.otp.erlang.OtpErlangObject;
import org.jetbrains.annotations.NotNull;

public interface ElixirCaptureBlockOperation extends PrefixOperation {

  @NotNull
  ElixirBlockExpression getBlockExpression();

  @NotNull
  ElixirCapturePrefixOperator getCapturePrefixOperator();

  @NotNull
  OtpErlangObject quote();

}