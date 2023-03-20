package com.funwithscala.cats

import cats.effect.*

object Main extends IOApp.Simple:
  def run: IO[Unit] = Echo.program
