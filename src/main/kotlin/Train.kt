class Train {
    private var direction = Pair<String,String>("","")
    private var tiket = 0
    private var van = 0
    private var vans = mutableListOf<Van>()

    fun setTiket(tiket: Int) {
        this.tiket = tiket
    }

    fun setDirection(direction: Pair<String,String>) {
        this.direction = direction
    }
    fun getTiket(): Int {
        return tiket
    }

    fun getWay(): Pair<String,String> {
        return direction
    }
    fun getVans(): List<Van> {
        return vans
    }

    fun getNumberOfVans(): Int {
        return vans.size
    }
    fun creat(){
        var capacity = 0
        var passengers = tiket
        var countVans = 1
        while (passengers != 0){
            capacity = (5..25).random()
            if(passengers - capacity >= 0){
                passengers -= capacity
                vans.add(Van(capacity,capacity))
            }else{
                vans.add(Van(capacity,passengers))
                passengers = 0
            }
        }
    }
    fun send(){
        println("Поезд ${direction.first} - ${direction.second}, состоящий из ${vans.size} вагонов, отправлен")
        for ((index, Van) in vans.withIndex()) {
            println("Вагон ${index + 1}: Вместимость - ${Van.capacity}, Пассажиров - ${Van.passengers}")
        }
    }
}
data class Van(val capacity: Int, val passengers: Int)