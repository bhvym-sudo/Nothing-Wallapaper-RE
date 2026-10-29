.class final Lg9/s$q;
.super Lg9/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "q"
.end annotation


# instance fields
.field final a:Ljava/lang/Class;


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .registers 2

    invoke-direct {p0}, Lg9/s;-><init>()V

    iput-object p1, p0, Lg9/s$q;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method a(Lg9/v;Ljava/lang/Object;)V
    .registers 3

    iget-object p0, p0, Lg9/s$q;->a:Ljava/lang/Class;

    invoke-virtual {p1, p0, p2}, Lg9/v;->h(Ljava/lang/Class;Ljava/lang/Object;)V

    return-void
.end method
