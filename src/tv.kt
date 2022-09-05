/**
 * Класс телевизор
 * @property firma - фирма
 * @property screen - диагональ экрана
 * @property noise - звуковая мощность
 *
 * @author Сотников Юрий
 * @author Изотов Владимир
 */
open class Tv(_firma: String,_screen:Double,_noise:Int) {
    private var firma : String
    private var screen :Double
    private var noise : Int
    init {
        firma= _firma
        screen= _screen
        noise= _noise
    }

    /**
     * Расчет качества обьекта
     * @return - качество обьекта рассчитоное по формуле [Double]
     * @author Сотников Юрий,Изотов Владимир
     */
    open fun Q(): Double{
        return screen+(0.05*noise)
    }

    /**
     * Вывод информации на экран
     * @return - строка с информауией [toString]
     * @author Сотников Юрий,Изотов Владимир
     */
    open fun printInfo():String{
        return "Фирма $firma , диагональ экрана $screen, звуковая мощность $noise, Q ${Q()}"
    }
}