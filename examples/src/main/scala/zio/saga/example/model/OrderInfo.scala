package zio.saga.example.model
import java.util.UUID


case class OrderInfo(userId: UUID, orderId: BigInt, money: BigDecimal, bonuses: Double)

object OrderInfo {
  import io.circe._, io.circe.generic.semiauto._
  implicit val OrderInfoDecoder: Decoder[OrderInfo] = deriveDecoder[OrderInfo]
}