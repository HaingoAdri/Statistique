import { useState } from 'react';
import { Message, getMessage } from '../data/messages';
import {
  IonBackButton,
  IonButtons,
  IonContent,
  IonHeader,
  IonIcon,
  IonItem,
  IonLabel,
  IonNote,
  IonPage,
  IonToolbar,
  useIonViewWillEnter,
  IonCard,
  IonCardHeader,
  IonCardTitle,
  IonCardSubtitle,
  IonCardContent
} from '@ionic/react';
import { personCircle } from 'ionicons/icons';
import { useParams } from 'react-router';
import './ViewMessage.css';

function ViewMessage() {
  const [message, setMessage] = useState<Message>();
  const params = useParams<{ id: string }>();

  useIonViewWillEnter(() => {
    const msg = getMessage(parseInt(params.id, 10));
    setMessage(msg);
  });

  return (
    <IonPage id="view-message-page">
      <IonHeader translucent>
        <IonToolbar color="primary">
          <IonButtons slot="start">
            <IonBackButton text="Inbox" defaultHref="/home"></IonBackButton>
          </IonButtons>
        </IonToolbar>
      </IonHeader>

      <IonContent fullscreen>
        {message ? (
          <>
            <IonItem>
              <IonIcon aria-hidden="true" icon={personCircle} color="primary"></IonIcon>
              <IonLabel className="ion-text-wrap">
                <h2>
                  Equipe : 
                  {message.fromName}
                  
                </h2>
                <h3>
                  To: <IonNote>Me</IonNote>
                </h3>
              </IonLabel>
            </IonItem>

            <div className="ion-padding">
              <IonCard color="light">
                <IonCardHeader>
                  <IonCardTitle>Nom Joueur</IonCardTitle>
                </IonCardHeader>

                <IonCardContent>Match Jouer : </IonCardContent>
                <IonCardContent>PPM :</IonCardContent>
                <IonCardContent>RPM :</IonCardContent>
                <IonCardContent>PDPM :</IonCardContent>
                <IonCardContent>3P% : </IonCardContent>
                <IonCardContent>FG% : </IonCardContent>
                <IonCardContent>LF % :</IonCardContent>
              </IonCard>
              <IonCard color="light">
                <IonCardHeader>
                  <IonCardTitle>Nom Joueur</IonCardTitle>
                </IonCardHeader>

                <IonCardContent>Match Jouer : </IonCardContent>
                <IonCardContent>PPM :</IonCardContent>
                <IonCardContent>RPM :</IonCardContent>
                <IonCardContent>PDPM :</IonCardContent>
                <IonCardContent>3P% : </IonCardContent>
                <IonCardContent>FG% : </IonCardContent>
                <IonCardContent>LF % :</IonCardContent>
              </IonCard>
            </div>
          </>
        ) : (
          <div>Message not found</div>
        )}
      </IonContent>
    </IonPage>
  );
}

export default ViewMessage;
