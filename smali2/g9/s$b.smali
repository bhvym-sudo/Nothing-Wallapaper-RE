.class Lg9/s$b;
.super Lg9/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg9/s;->b()Lg9/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg9/s;


# direct methods
.method constructor <init>(Lg9/s;)V
    .registers 2

    iput-object p1, p0, Lg9/s$b;->a:Lg9/s;

    invoke-direct {p0}, Lg9/s;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lg9/v;Ljava/lang/Object;)V
    .registers 7

    if-nez p2, :cond_3

    goto :goto_16

    :cond_3
    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    :goto_8
    if-ge v1, v0, :cond_16

    iget-object v2, p0, Lg9/s$b;->a:Lg9/s;

    invoke-static {p2, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Lg9/s;->a(Lg9/v;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_16
    :goto_16
    return-void
.end method
