type Option[A] = Either[Const[Unit, A], Id[A]]