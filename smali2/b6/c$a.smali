.class Lb6/c$a;
.super Lb6/c$p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb6/c;->l(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Z

.field final synthetic d:Ljava/lang/Object;

.field final synthetic e:Lb6/c;


# direct methods
.method varargs constructor <init>(Lb6/c;[Lb6/c$q;ZLjava/lang/Object;)V
    .registers 5

    iput-object p1, p0, Lb6/c$a;->e:Lb6/c;

    iput-boolean p3, p0, Lb6/c$a;->c:Z

    iput-object p4, p0, Lb6/c$a;->d:Ljava/lang/Object;

    invoke-direct {p0, p1, p2}, Lb6/c$p;-><init>(Lb6/c;[Lb6/c$q;)V

    return-void
.end method


# virtual methods
.method protected b(Lb6/c$j;Lb6/c$g;Lb6/c$f;)Ljava/lang/Object;
    .registers 4

    if-eqz p2, :cond_10

    invoke-virtual {p2}, Lb6/c$g;->getValue()Ljava/lang/Object;

    move-result-object p1

    iget-boolean p3, p0, Lb6/c$a;->c:Z

    if-eqz p3, :cond_f

    iget-object p0, p0, Lb6/c$a;->d:Ljava/lang/Object;

    invoke-virtual {p2, p0}, Lb6/c$g;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    return-object p1

    :cond_10
    iget-object p0, p0, Lb6/c$a;->d:Ljava/lang/Object;

    invoke-virtual {p3, p0}, Lb6/c$f;->a(Ljava/lang/Object;)V

    const/4 p0, 0x0

    return-object p0
.end method
