.class final Lg9/s$n;
.super Lg9/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "n"
.end annotation


# instance fields
.field private final a:Lg9/h;

.field private final b:Z


# direct methods
.method constructor <init>(Lg9/h;Z)V
    .registers 3

    invoke-direct {p0}, Lg9/s;-><init>()V

    iput-object p1, p0, Lg9/s$n;->a:Lg9/h;

    iput-boolean p2, p0, Lg9/s$n;->b:Z

    return-void
.end method


# virtual methods
.method a(Lg9/v;Ljava/lang/Object;)V
    .registers 4

    if-nez p2, :cond_3

    return-void

    :cond_3
    iget-object v0, p0, Lg9/s$n;->a:Lg9/h;

    invoke-interface {v0, p2}, Lg9/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const/4 v0, 0x0

    iget-boolean p0, p0, Lg9/s$n;->b:Z

    invoke-virtual {p1, p2, v0, p0}, Lg9/v;->g(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
