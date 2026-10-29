.class Lb6/c$d;
.super Lb6/c$p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb6/c;->replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Ljava/lang/Object;

.field final synthetic e:Lb6/c;


# direct methods
.method varargs constructor <init>(Lb6/c;[Lb6/c$q;Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 5

    iput-object p1, p0, Lb6/c$d;->e:Lb6/c;

    iput-object p3, p0, Lb6/c$d;->c:Ljava/lang/Object;

    iput-object p4, p0, Lb6/c$d;->d:Ljava/lang/Object;

    invoke-direct {p0, p1, p2}, Lb6/c$p;-><init>(Lb6/c;[Lb6/c$q;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lb6/c$j;Lb6/c$g;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, Lb6/c$d;->d(Lb6/c$j;Lb6/c$g;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method protected d(Lb6/c$j;Lb6/c$g;)Ljava/lang/Boolean;
    .registers 4

    if-eqz p2, :cond_16

    invoke-virtual {p2}, Lb6/c$g;->getValue()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lb6/c$d;->c:Ljava/lang/Object;

    invoke-static {p1, v0}, Lb6/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_16

    iget-object p0, p0, Lb6/c$d;->d:Ljava/lang/Object;

    invoke-virtual {p2, p0}, Lb6/c$g;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_16
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0
.end method
