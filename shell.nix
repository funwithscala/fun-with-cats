let
  pkgs = import <nixpkgs> {};

  sbt = pkgs.sbt.override {
    jre = pkgs.graalvm17-ce;
  };

in pkgs.mkShell rec {
  name = "fun-with-cats-shell";

  buildInputs = [
    sbt
  ];
}
