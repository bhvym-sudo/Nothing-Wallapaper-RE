.class final Lg9/s$p;
.super Lg9/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "p"
.end annotation


# instance fields
.field private final a:Ljava/lang/reflect/Method;

.field private final b:I


# direct methods
.method constructor <init>(Ljava/lang/reflect/Method;I)V
    .registers 3

    invoke-direct {p0}, Lg9/s;-><init>()V

    iput-object p1, p0, Lg9/s$p;->a:Ljava/lang/reflect/Method;

    iput p2, p0, Lg9/s$p;->b:I

    return-void
.end method


# virtual methods
.method a(Lg9/v;Ljava/lang/Object;)V
    .registers 4

    if-eqz p2, :cond_6

    invoke-virtual {p1, p2}, Lg9/v;->m(Ljava/lang/Object;)V

    return-void

    :cond_6
    iget-object p1, p0, Lg9/s$p;->a:Ljava/lang/reflect/Method;

    iget p0, p0, Lg9/s$p;->b:I

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "@Url parameter is null."

    invoke-static {p1, p0, v0, p2}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method
