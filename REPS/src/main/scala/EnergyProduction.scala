import java.time.LocalDateTime

case class EnergyProduction(
  start: LocalDateTime,
  end: LocalDateTime,
  production: Double
)
