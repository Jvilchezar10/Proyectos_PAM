import 'package:flutter/Material.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';

class backweather extends StatelessWidget {
  const backweather({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Stack(
      children: <Widget>[
        const GradientBack(),
        Positioned(
          bottom: 0.0,
          child: Container(
            width: MediaQuery.of(context).size.width,
            height: 250.0,
            color: Colors.white,
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceAround,
                  children: [
                    const Icon(
                      FontAwesomeIcons.cloudRain,
                      size: 60.0,
                      color: Colors.grey,
                    ),
                    const Icon(
                      FontAwesomeIcons.cloudSun,
                      size: 60.0,
                      color: Colors.grey,
                    ),
                    const Icon(
                      FontAwesomeIcons.wind,
                      size: 60.0,
                      color: Colors.grey,
                    ),
                    const Icon(
                      FontAwesomeIcons.sun,
                      size: 60.0,
                      color: Colors.grey,
                    ),
                  ],
                ),
                const SizedBox(height: 55.0),
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceAround,
                  children: [
                    const Text(
                      'MON', //lunes
                      style: const TextStyle(
                        fontSize: 25.0,
                        color: Colors.grey,
                      ),
                    ),
                    const Text(
                      'TUE', //Martes
                      style: TextStyle(
                        fontSize: 25.0,
                        color: Colors.grey,
                      ),
                    ),
                    const Text(
                      'WED', //Miercoles
                      style: const TextStyle(
                        fontSize: 25.0,
                        color: Colors.grey,
                      ),
                    ),
                    const Text(
                      'THU', //Jueves
                      style: const TextStyle(
                        fontSize: 25.0,
                        color: Colors.grey,
                      ),
                    ),
                    const Text(
                      'FRI', //Viernes
                      style: const TextStyle(
                        fontSize: 25.0,
                        color: Colors.grey,
                      ),
                    ),
                  ],
                ),
              ],
            ),
          ),
        ),
      ],
    );
  }
}

class GradientBack extends StatelessWidget {
  const GradientBack({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      decoration: const BoxDecoration(
        gradient: LinearGradient(
            colors: [Color(0xFFffbb00), Color(0xFFf38c02)],
            begin: FractionalOffset(1.0, 0.1),
            end: FractionalOffset(1.0, 0.9)),
      ),
    );
  }
}
