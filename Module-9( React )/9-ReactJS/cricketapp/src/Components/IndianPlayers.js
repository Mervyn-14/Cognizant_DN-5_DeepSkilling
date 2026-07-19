import React from "react";

const IndianTeam = [
  "Sachin",
  "Dhoni",
  "Virat",
  "Rohit",
  "Yuvraj",
  "Raina"
];

const [
  first,
  second,
  third,
  fourth,
  fifth,
  sixth
] = IndianTeam;

const T20Players = [
  "First Player",
  "Second Player",
  "Third Player"
];

const RanjiPlayers = [
  "Fourth Player",
  "Fifth Player",
  "Sixth Player"
];

const IndianPlayers = [
  ...T20Players,
  ...RanjiPlayers
];

function IndianPlayersComponent() {

  return (

    <div>

      <h1>Odd Players</h1>

      <ul>
        <li>First : {first}</li>
        <li>Third : {third}</li>
        <li>Fifth : {fifth}</li>
      </ul>

      <hr />

      <h1>Even Players</h1>

      <ul>
        <li>Second : {second}</li>
        <li>Fourth : {fourth}</li>
        <li>Sixth : {sixth}</li>
      </ul>

      <hr />

      <h1>List of Indian Players Merged</h1>

      <ul>
        {
          IndianPlayers.map((player, index) => (
            <li key={index}>
              Mr. {player}
            </li>
          ))
        }
      </ul>

    </div>

  );

}

export default IndianPlayersComponent;