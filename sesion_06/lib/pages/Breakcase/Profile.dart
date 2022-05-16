import 'package:flutter/Material.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';

class Profile extends StatefulWidget {
  Profile({Key? key}) : super(key: key);

  @override
  _profile createState() => _profile();
}

class _profile extends State<Profile> {
  @override
  Widget build(BuildContext context) {
    return const getProfileLoaded();
  }
}

class getProfileLoaded extends StatelessWidget {
  const getProfileLoaded({
    Key? key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: CustomScrollView(
        slivers: [
          SliverAppBar(
            pinned: true,
            snap: true,
            floating: true,
            expandedHeight: 280,
            flexibleSpace: FlexibleSpaceBar(
                centerTitle: true,
                title: Text(
                  '@Juan Vilchez',
                  style: TextStyle(
                    fontSize: 16,
                    shadows: [
                      Shadow(
                          color: Theme.of(context).primaryColorDark,
                          blurRadius: 10)
                    ],
                  ),
                ),
                background: Container(
                  decoration: const BoxDecoration(
                    image: DecorationImage(
                      image: NetworkImage(
                          'https://cdn.pixabay.com/photo/2014/04/25/01/39/skateboard-331751_960_720.jpg'),
                      alignment: Alignment.center,
                      fit: BoxFit.fitWidth,
                    ),
                  ),
                  // child: CircleAvatar(
                  //   foregroundImage: NetworkImage(
                  //     state.user.imageUrls[0],
                  //     // fit: BoxFit.fill,
                  //   ),
                  // ),
                )),
          ),
          SliverFillRemaining(
            hasScrollBody: true,
            fillOverscroll: true,
            child: SingleChildScrollView(
              child: Column(
                children: [
                  Container(
                    margin: const EdgeInsets.only(bottom: 10),
                    // width: double.infinity,
                    height: 80,
                    child: Container(
                      padding: const EdgeInsets.symmetric(vertical: 20),
                      decoration: BoxDecoration(
                        color: Theme.of(context).primaryColor,
                        borderRadius: const BorderRadius.vertical(
                          bottom: Radius.circular(25),
                        ),
                      ),
                      child: Row(
                        mainAxisSize: MainAxisSize.max,
                        mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                        children: <Widget>[
                          Column(
                            children: <Widget>[
                              Text(
                                'Edad',
                                style: TextStyle(
                                    color: Theme.of(context).primaryColorLight,
                                    fontSize: 18.0),
                              ),
                              Text(
                                "19",
                                style: TextStyle(
                                    color: Theme.of(context).primaryColorLight,
                                    fontSize: 12.0),
                              ),
                            ],
                          ),
                          Column(
                            children: <Widget>[
                              Text(
                                "Sexo",
                                style: TextStyle(
                                    color: Theme.of(context).primaryColorLight,
                                    fontSize: 18.0),
                              ),
                              Text(
                                "Masculino",
                                style: TextStyle(
                                    color: Theme.of(context).primaryColorLight,
                                    fontSize: 12.0),
                              ),
                            ],
                          ),
                        ],
                      ),
                    ),
                  ),
                  const Body(),
                ],
              ),
            ),
          ),
        ],
      ),
    );
  }
}

class Body extends StatefulWidget {
  const Body({
    Key? key,
  }) : super(key: key);

  @override
  State<Body> createState() => _BodyState();
}

class _BodyState extends State<Body> {
  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: <Widget>[
        Padding(
          padding: const EdgeInsets.symmetric(horizontal: 25),
          child: Container(
            decoration: BoxDecoration(
              color: Theme.of(context).primaryColorDark.withOpacity(0.1),
              borderRadius: BorderRadius.circular(20),
            ),
          ),
        ),
        const SizedBox(height: 10),
        const Padding(
          padding: EdgeInsets.only(left: 30.0),
          child: Text(
            'Un poco de mi',
            style: const TextStyle(color: Colors.black87, fontSize: 20.0),
          ),
        ),
        const Padding(
          padding: EdgeInsets.only(left: 30.0, top: 5.0),
          child: Text(
            'Lorem Ipsum is simply dummy text of the printing and typesetting industry.',
            style: TextStyle(
                color: Color.fromARGB(255, 116, 114, 114), fontSize: 20.0),
          ),
        ),
        const Padding(
          padding: EdgeInsets.only(left: 30.0, top: 15.0),
          child: Text(
            'Mi Educación',
            style: TextStyle(color: Colors.black87, fontSize: 20.0),
          ),
        ),
        const Padding(
          padding: EdgeInsets.only(left: 30.0, top: 5.0),
          child: Text(
            'Lorem Ipsum is simply dummy text of the printing and typesetting industry.',
            style: TextStyle(
                color: Color.fromARGB(255, 116, 114, 114), fontSize: 20.0),
          ),
        ),
        const Padding(
          padding: EdgeInsets.only(left: 30.0, top: 15.0),
          child: Text(
            'Mis Redes Sociales',
            style: TextStyle(color: Colors.black87, fontSize: 20.0),
          ),
        ),
        SizedBox(height: 20.0),
        Row(
          mainAxisAlignment: MainAxisAlignment.spaceAround,
          children: [
            Icon(FontAwesomeIcons.instagram),
            Icon(FontAwesomeIcons.linkedin),
            Icon(FontAwesomeIcons.github),
          ],
        ),
      ],
    );
  }
}
