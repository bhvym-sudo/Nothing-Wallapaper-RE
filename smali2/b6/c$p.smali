.class abstract Lb6/c$p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "p"
.end annotation


# instance fields
.field private final a:Ljava/util/EnumSet;

.field final synthetic b:Lb6/c;


# direct methods
.method public varargs constructor <init>(Lb6/c;[Lb6/c$q;)V
    .registers 3

    iput-object p1, p0, Lb6/c$p;->b:Lb6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length p1, p2

    if-nez p1, :cond_f

    const-class p1, Lb6/c$q;

    invoke-static {p1}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object p1

    goto :goto_16

    :cond_f
    const/4 p1, 0x0

    aget-object p1, p2, p1

    invoke-static {p1, p2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object p1

    :goto_16
    iput-object p1, p0, Lb6/c$p;->a:Ljava/util/EnumSet;

    return-void
.end method


# virtual methods
.method protected a(Lb6/c$j;Lb6/c$g;)Ljava/lang/Object;
    .registers 3

    const/4 p0, 0x0

    return-object p0
.end method

.method protected b(Lb6/c$j;Lb6/c$g;Lb6/c$f;)Ljava/lang/Object;
    .registers 4

    invoke-virtual {p0, p1, p2}, Lb6/c$p;->a(Lb6/c$j;Lb6/c$g;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public c(Lb6/c$q;)Z
    .registers 2

    iget-object p0, p0, Lb6/c$p;->a:Ljava/util/EnumSet;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
