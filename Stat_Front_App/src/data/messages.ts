export interface Message {
  fromName: string;
  subject: string;
  id: number;
}

const messages: Message[] = [
  {
    fromName: 'Rota Annice',
    subject: 'Lancer Front',
    id: 0
  },
  {
    fromName: 'Bill Thomas',
    subject: 'The situation',  
    id: 3
  },
  {
    fromName: 'Joanne Pollan',
    subject: 'Updated invitation: Swim lessons',
    
    id: 4
  },
  {
    fromName: 'Andrea Cornerston',
    subject: 'Last minute ask',
    
    id: 5
  },
  {
    fromName: 'Moe Chamont',
    subject: 'Family Calendar - Version 1',
    
    id: 6
  },
  {
    fromName: 'Kelly Richardson',
    subject: 'Placeholder Headhots',
    
    id: 7
  }
];

export const getMessages = () => messages;

export const getMessage = (id: number) => messages.find(m => m.id === id);
