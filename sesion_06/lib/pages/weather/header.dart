import 'package:flutter/Material.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'package:sesion_o6/pages/Custom/button_custom.dart';
import 'backweather.dart';

class header extends StatelessWidget {
  const header({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Stack(
        children: <Widget>[
          const backweather(),
          Container(
            alignment: Alignment.center,
            margin: const EdgeInsets.only(top: 50.0),
            child: Column(
              children: <Widget>[
                const Text(
                  'TUESDAY',
                  style: TextStyle(
                    fontSize: 55.0,
                    color: Color(0xFFeba800),
                    fontWeight: FontWeight.w600,
                  ),
                ),
                const SizedBox(
                  height: 10.0,
                ),
                Icon(
                  FontAwesomeIcons.bell,
                  color: Colors.orange.shade900,
                ),
                const button_weather(),
                Row(
                  children: [
                    Expanded(
                      child: Table(
                        children: <TableRow>[
                          TableRow(
                            children: <Widget>[
                              Column(
                                crossAxisAlignment: CrossAxisAlignment.start,
                                children: <Widget>[
                                  Padding(
                                    padding: const EdgeInsets.only(
                                        left: 20.0, bottom: 5.0),
                                    child: const Icon(
                                      FontAwesomeIcons.cloudSun,
                                      size: 70.0,
                                      color: Colors.white,
                                    ),
                                  ),
                                  Row(
                                    mainAxisAlignment: MainAxisAlignment.center,
                                    children: <Widget>[
                                      Column(
                                        crossAxisAlignment:
                                            CrossAxisAlignment.start,
                                        children: const <Widget>[
                                          Text(
                                            'Perú',
                                            style: TextStyle(
                                                fontSize: 25.0,
                                                color: Colors.white),
                                          ),
                                          Text(
                                            '16/05/2022',
                                            style: TextStyle(
                                                fontSize: 15.0,
                                                color: Colors.white),
                                          )
                                        ],
                                      ),
                                      const Padding(
                                        padding: EdgeInsets.only(left: 20.0),
                                        child: Icon(
                                          FontAwesomeIcons.arrowsRotate,
                                          color: Colors.white,
                                          size: 20.0,
                                        ),
                                      ),
                                    ],
                                  ),
                                ],
                              )
                            ],
                          ),
                        ],
                      ),
                    ),
                    Expanded(
                      child: SizedBox(
                        height: 190,
                        child: Column(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: [
                            Row(
                              mainAxisAlignment: MainAxisAlignment.center,
                              crossAxisAlignment: CrossAxisAlignment.start,
                              children: const [
                                Text(
                                  '34',
                                  style: TextStyle(
                                      fontSize: 125.0, color: Colors.white),
                                ),
                                Text(
                                  '°C',
                                  style: TextStyle(
                                      fontSize: 35.0, color: Colors.white),
                                )
                              ],
                            ),
                          ],
                        ),
                      ),
                    ),
                  ],
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
