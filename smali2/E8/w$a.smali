.class public final LE8/w$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD8/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/w;->l0(Ljava/lang/CharSequence;)LD8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .registers 2

    iput-object p1, p0, LE8/w$a;->a:Ljava/lang/CharSequence;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .registers 2

    new-instance v0, LE8/f;

    iget-object p0, p0, LE8/w$a;->a:Ljava/lang/CharSequence;

    invoke-direct {v0, p0}, LE8/f;-><init>(Ljava/lang/CharSequence;)V

    return-object v0
.end method
