.class Lb6/c$e;
.super Lb6/c$p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb6/c;->replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Lb6/c;


# direct methods
.method varargs constructor <init>(Lb6/c;[Lb6/c$q;Ljava/lang/Object;)V
    .registers 4

    iput-object p1, p0, Lb6/c$e;->d:Lb6/c;

    iput-object p3, p0, Lb6/c$e;->c:Ljava/lang/Object;

    invoke-direct {p0, p1, p2}, Lb6/c$p;-><init>(Lb6/c;[Lb6/c$q;)V

    return-void
.end method


# virtual methods
.method protected a(Lb6/c$j;Lb6/c$g;)Ljava/lang/Object;
    .registers 3

    if-eqz p2, :cond_c

    invoke-virtual {p2}, Lb6/c$g;->getValue()Ljava/lang/Object;

    move-result-object p1

    iget-object p0, p0, Lb6/c$e;->c:Ljava/lang/Object;

    invoke-virtual {p2, p0}, Lb6/c$g;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1

    :cond_c
    const/4 p0, 0x0

    return-object p0
.end method
