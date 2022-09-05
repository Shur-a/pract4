/**
 * Класс Страна производитиель
 * @author Сотников Юрий
 * @author Изотов Владимир
 */
class CountryCreater(_firma: String,_screen:Double,_noise:Int,_P:String):Tv(_firma,_screen,_noise) {
    private var P:String
    init {
        P=_P
    }

    /**
     * Вывод информации на экран
     * @return - строка с информауией [String]
     * @author Сотников Юрий,Изотов Владимир
     */
    override fun printInfo(): String{
        return super.printInfo()+"Страна-производитель: $P, Qp = " + Qp()
    }
    /**
     * Расчет качества обьекта
     * @return - качество обьекта рассчитоное по формуле [Double]
     * @author Сотников Юрий,Изотов Владимир
     */
   open fun Qp(): Double {

       var Qp: Double = 0.0


       if(P=="Япония"){
           Qp = (2 * super.Q()).toDouble()
       }
       else if (P == "Сингапур"){
           Qp = (1.5 * Q()).toDouble()
       }
       else if(P=="Корея"){
           Qp= Q().toDouble()
       }
       else {
           Qp = 0.0
       }

       return Qp.toDouble()

   }
}