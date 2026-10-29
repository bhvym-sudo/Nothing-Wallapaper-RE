.class final Lg9/s$f;
.super Lg9/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "f"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lg9/h;

.field private final c:Z


# direct methods
.method constructor <init>(Ljava/lang/String;Lg9/h;Z)V
    .registers 5

    invoke-direct {p0}, Lg9/s;-><init>()V

    const-string v0, "name == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lg9/s$f;->a:Ljava/lang/String;

    iput-object p2, p0, Lg9/s$f;->b:Lg9/h;

    iput-boolean p3, p0, Lg9/s$f;->c:Z

    return-void
.end method


# virtual methods
.method a(Lg9/v;Ljava/lang/Object;)V
    .registers 4

    if-nez p2, :cond_3

    goto :goto_d

    :cond_3
    iget-object v0, p0, Lg9/s$f;->b:Lg9/h;

    invoke-interface {v0, p2}, Lg9/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_e

    :goto_d
    return-void

    :cond_e
    iget-object v0, p0, Lg9/s$f;->a:Ljava/lang/String;

    iget-boolean p0, p0, Lg9/s$f;->c:Z

    invoke-virtual {p1, v0, p2, p0}, Lg9/v;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
