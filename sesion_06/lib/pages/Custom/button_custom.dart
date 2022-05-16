import 'package:flutter/Material.dart';

class button_weather extends StatelessWidget {
  const button_weather({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return InkWell(
      onTap: () {},
      child: Container(
        margin: EdgeInsets.only(top: 30.0, left: 20.0, right: 20),
        height: 50.0,
        width: 180.0,
        decoration: BoxDecoration(
          boxShadow: [
            BoxShadow(
              color: Color(0xFFf38b02),
              offset: Offset(10.0, 10.0),
              blurRadius: 30.0,
            )
          ],
          borderRadius: BorderRadius.circular(30.0),
          color: Color(0xFFfeb800),
        ),
        child: Center(
          child: Text(
            'GO TO CALENDAR',
            style: TextStyle(
              fontSize: 12.0,
              color: Colors.white,
              fontWeight: FontWeight.w900,
            ),
          ),
        ),
      ),
    );
  }
}
